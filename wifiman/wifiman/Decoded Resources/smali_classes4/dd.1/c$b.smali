.class final Ldd/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/c;->a(Ljava/lang/String;II)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldd/c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Ldd/c;Ljava/lang/String;II)V
    .locals 0

    iput-object p1, p0, Ldd/c$b;->a:Ldd/c;

    iput-object p2, p0, Ldd/c$b;->b:Ljava/lang/String;

    iput p3, p0, Ldd/c$b;->c:I

    iput p4, p0, Ldd/c$b;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/LinkedList;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/util/LinkedList;

    iget-object p1, p0, Ldd/c$b;->a:Ldd/c;

    invoke-static {p1}, Ldd/c;->d(Ldd/c;)LYc/c;

    move-result-object p1

    invoke-interface {p1}, LYc/c;->e()Lgg/i;

    move-result-object p1

    new-instance v0, Ldd/c$b$a;

    iget-object v2, p0, Ldd/c$b;->b:Ljava/lang/String;

    iget-object v3, p0, Ldd/c$b;->a:Ldd/c;

    iget v4, p0, Ldd/c$b;->c:I

    iget v7, p0, Ldd/c$b;->d:I

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ldd/c$b$a;-><init>(Ljava/lang/String;Ldd/c;ILjava/util/LinkedList;Ljava/util/LinkedList;I)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Ldd/c$b;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
