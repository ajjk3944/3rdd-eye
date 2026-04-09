.class public final LZ6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY6/h$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ6/a$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Class;

.field final b:Ljava/lang/String;

.field final c:Ljava/util/List;

.field final d:Ljava/util/List;

.field final e:LY6/h;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LY6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ6/a;->a:Ljava/lang/Class;

    iput-object p2, p0, LZ6/a;->b:Ljava/lang/String;

    iput-object p3, p0, LZ6/a;->c:Ljava/util/List;

    iput-object p4, p0, LZ6/a;->d:Ljava/util/List;

    iput-object p5, p0, LZ6/a;->e:LY6/h;

    return-void
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;
    .locals 7

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    new-instance v6, LZ6/a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, LZ6/a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LY6/h;)V

    return-object v6

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string/jumbo p1, "labelKey == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string/jumbo p1, "baseType == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;Ljava/util/Set;LY6/r;)LY6/h;
    .locals 6

    invoke-static {p1}, LY6/v;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, LZ6/a;->a:Ljava/lang/Class;

    if-ne p1, v0, :cond_2

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    iget-object p1, p0, LZ6/a;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p1, p0, LZ6/a;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    iget-object v0, p0, LZ6/a;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    invoke-virtual {p3, v0}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, LZ6/a$a;

    iget-object v1, p0, LZ6/a;->b:Ljava/lang/String;

    iget-object v2, p0, LZ6/a;->c:Ljava/util/List;

    iget-object v3, p0, LZ6/a;->d:Ljava/util/List;

    iget-object v5, p0, LZ6/a;->e:LY6/h;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, LZ6/a$a;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;LY6/h;)V

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;
    .locals 7

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    iget-object v0, p0, LZ6/a;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, LZ6/a;->c:Ljava/util/List;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Ljava/util/ArrayList;

    iget-object p2, p0, LZ6/a;->d:Ljava/util/List;

    invoke-direct {v5, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, LZ6/a;

    iget-object v2, p0, LZ6/a;->a:Ljava/lang/Class;

    iget-object v3, p0, LZ6/a;->b:Ljava/lang/String;

    iget-object v6, p0, LZ6/a;->e:LY6/h;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LZ6/a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LY6/h;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "Labels must be unique."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "label == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "subtype == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
