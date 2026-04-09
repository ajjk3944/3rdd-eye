.class public final Lk6/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk6/a$a;->a(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lk6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Float;

.field final synthetic c:Ljava/lang/Float;

.field final synthetic d:Ljava/lang/Float;

.field final synthetic e:Ljava/lang/Float;


# direct methods
.method constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lk6/a$a$a;->b:Ljava/lang/Float;

    iput-object p2, p0, Lk6/a$a$a;->c:Ljava/lang/Float;

    iput-object p3, p0, Lk6/a$a$a;->d:Ljava/lang/Float;

    iput-object p4, p0, Lk6/a$a$a;->e:Ljava/lang/Float;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    check-cast p1, Lx6/b;

    invoke-virtual {p0, p1}, Lk6/a$a$a;->e(Lx6/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    check-cast p1, Lx6/b;

    invoke-virtual {p0, p1}, Lk6/a$a$a;->f(Lx6/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    check-cast p1, Lx6/b;

    invoke-virtual {p0, p1}, Lk6/a$a$a;->g(Lx6/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    check-cast p1, Lx6/b;

    invoke-virtual {p0, p1}, Lk6/a$a$a;->h(Lx6/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public e(Lx6/b;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lk6/a$a$a;->c:Ljava/lang/Float;

    return-object p1
.end method

.method public f(Lx6/b;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lk6/a$a$a;->e:Ljava/lang/Float;

    return-object p1
.end method

.method public g(Lx6/b;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lk6/a$a$a;->b:Ljava/lang/Float;

    return-object p1
.end method

.method public h(Lx6/b;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lk6/a$a$a;->d:Ljava/lang/Float;

    return-object p1
.end method
