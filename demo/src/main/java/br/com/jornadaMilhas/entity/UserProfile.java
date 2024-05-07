package br.com.jornadaMilhas.entity;

import br.com.jornadaMilhas.dto.UserProfileDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Table(name = "tb_users_profile")
@Entity(name = "UserProfile")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] userPicture;

    private String userName;

    private String comment;

    public UserProfile(UserProfileDto userProfileDto) {
        this.userPicture = userProfileDto.userPicture();
        this.userName = userProfileDto.userName();
        this.comment = userProfileDto.comment();
    }
}
