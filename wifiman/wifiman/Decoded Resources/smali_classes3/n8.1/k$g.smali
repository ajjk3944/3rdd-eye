.class final Ln8/k$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/k;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/k;


# direct methods
.method constructor <init>(Ln8/k;)V
    .locals 0

    iput-object p1, p0, Ln8/k$g;->a:Ln8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ln8/k;LCc/l;)LCc/l;
    .locals 0

    invoke-static {p0, p1}, Ln8/k$g;->c(Ln8/k;LCc/l;)LCc/l;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ln8/k;LCc/l;)LCc/l;
    .locals 9

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ln8/k;->t0(Ln8/k;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    :goto_0
    move-object v4, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    const/16 v7, 0x17

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, LCc/l;->b(LCc/l;Ljava/lang/String;La8/b;Lh9/a;Ljava/lang/String;JILjava/lang/Object;)LCc/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJe/m;

    invoke-virtual {p0, p1}, Ln8/k$g;->b(LJe/m;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(LJe/m;)Lgg/f;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LJe/m;->a()Lh9/a;

    move-result-object p1

    iget-object v0, p0, Ln8/k$g;->a:Ln8/k;

    invoke-static {v0}, Ln8/k;->s0(Ln8/k;)LCc/n;

    move-result-object v0

    iget-object v1, p0, Ln8/k$g;->a:Ln8/k;

    new-instance v2, Ln8/l;

    invoke-direct {v2, v1}, Ln8/l;-><init>(Ln8/k;)V

    invoke-interface {v0, p1, v2}, LCc/n;->c(Lh9/a;Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
