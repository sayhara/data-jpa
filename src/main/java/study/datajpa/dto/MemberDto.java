package study.datajpa.dto;

import lombok.Data;

@Data
// 엔티티에는 @Data를 웬만하면 쓰지 않아야함 (@Getter, @Setter 등이 있으므로)
public class MemberDto {

    private Long id;

    private String username;

    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
