package memento;

public class EditorState {

    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }


}
