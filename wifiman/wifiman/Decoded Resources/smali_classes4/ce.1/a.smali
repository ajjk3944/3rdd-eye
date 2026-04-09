.class public interface abstract Lce/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\'\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u0002H\'\u00a2\u0006\u0004\u0008\u0008\u0010\u0005J\u001f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0010H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lce/a;",
        "",
        "Lgg/z;",
        "Lce/b;",
        "a",
        "()Lgg/z;",
        "",
        "Lce/c;",
        "b",
        "Lce/f;",
        "report",
        "Lce/g;",
        "c",
        "(Lce/f;)Lgg/z;",
        "",
        "resultId",
        "Lce/e;",
        "Lgg/b;",
        "d",
        "(Ljava/lang/String;Lce/e;)Lgg/b;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lgg/z;
    .annotation runtime LRj/f;
        value = "/proxy/"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/z<",
            "Lce/b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lgg/z;
    .annotation runtime LRj/f;
        value = "/proxy/devices"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/z<",
            "Ljava/util/List<",
            "Lce/c;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lce/f;)Lgg/z;
    .param p1    # Lce/f;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/proxy/feedback"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/f;",
            ")",
            "Lgg/z<",
            "Lce/g;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Lce/e;)Lgg/b;
    .param p1    # Ljava/lang/String;
        .annotation runtime LRj/s;
            value = "feedbackId"
        .end annotation
    .end param
    .param p2    # Lce/e;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/p;
        value = "/proxy/feedback/{feedbackId}/wifi_experience"
    .end annotation
.end method
