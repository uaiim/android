package app.uaiim.lyroom;

public class DataUrl {
	public static final String MAX = "15";
	public static final String START = "1";
	public static final String BASE = "https://www.blogger.com/feeds/298900102869691923";
	public static final String POSTS = "$BASE/posts/default";
	public static final String PAGES = "$BASE/pages/default";
	
	/*
	https://www.blogger.com/feeds/298900102869691923/posts/summary?alt=json
	URL
	list posts:	 https://www.blogger.com/feeds/BLOGID/posts/default
	list pages:	 https://www.blogger.com/feeds/BLOGID/pages/default
	detail post:	https://www.blogger.com/feeds/BLOGID/posts/default/POSTID
	detail page:	https://www.blogger.com/feeds/BLOGID/pages/default/PAGEID
	label:		  https://www.blogger.com/feeds/BLOGID/posts/default/-/LABEL
	multiple label: https://www.blogger.com/feeds/BLOGID/posts/default/-/LABEL/LABEL
	
	PARAMETER 
	Type:		?alt=json
	Search:	  q=KEYWORD
	MaxResult:   max-results=TOTALPERPAGE
	Start: 	  start-index=POSITION
	
	INPUT
	title, content, label, 
	link judul : api animelist
	link lampiran : ok.ru
	jenis mimetype : dailymotion
	link lampiran : copy file
	jenis mimetype : web auto copy file if deleted
	
	*/
}