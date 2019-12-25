package cinema.web.app.model;

import javax.persistence.*;

@Entity
@Table(name = "genres", schema = "public")
public class Genre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = true)
	private String description;
	
	//@ManyToMany(fetch = FetchType.LAZY,mappedBy = "genres")
	//@OneToMany(fetch = FetchType.LAZY)
	//@JoinTable(name = "movie_genres",
	//		inverseJoinColumns = {@JoinColumn(name = "movie_id", referencedColumnName = "id")},
	//		joinColumns  = {@JoinColumn(name="genre_id", referencedColumnName = "id", table = "movies")})
	//@JsonBackReference
	//@JsonManagedReference
	//@JsonIgnoreProperties("genres")
	//private Set<Movie> movies = new HashSet<>();
	
	public Genre() {
		
	}
	
	public Genre (String name, String description) {
		this.description = description;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
