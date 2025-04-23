package com.dailycodework.dreamshops.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.Data;
import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;


    @Lob
    private Blob image;
    private String downloadUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public static void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
