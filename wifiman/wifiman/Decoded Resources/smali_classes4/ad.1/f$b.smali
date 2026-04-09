.class final Lad/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/f;-><init>(Lad/a;LYc/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lad/f;


# direct methods
.method constructor <init>(Lad/f;)V
    .locals 0

    iput-object p1, p0, Lad/f$b;->a:Lad/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Network;

    if-nez p1, :cond_0

    sget-object p1, Lad/a$a$a$b;->a:Lad/a$a$a$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lad/f$b;->a:Lad/f;

    invoke-static {v0}, Lad/f;->d(Lad/f;)Lgg/z;

    move-result-object v0

    new-instance v1, Lad/f$b$a;

    iget-object v2, p0, Lad/f$b;->a:Lad/f;

    invoke-direct {v1, v2, p1}, Lad/f$b$a;-><init>(Lad/f;Landroid/net/Network;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    :goto_0
    sget-object v0, Lad/f$b$b;->a:Lad/f$b$b;

    invoke-virtual {p1, v0}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lad/f$b;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
