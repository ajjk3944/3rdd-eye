.class public final Ldx2;
.super Lh30;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lex2;


# direct methods
.method public constructor <init>(Lex2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldx2;->y:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldx2;->z:Lex2;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final q(Lu70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldx2;->z:Lex2;

    .line 2
    .line 3
    invoke-static {p1}, Lex2;->F3(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lex2;->C3(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final bridge synthetic r(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldx2;->y:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lg30;

    .line 4
    .line 5
    iget-object v1, p0, Ldx2;->z:Lex2;

    .line 6
    .line 7
    invoke-virtual {v1, p1, v0}, Lex2;->B3(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
