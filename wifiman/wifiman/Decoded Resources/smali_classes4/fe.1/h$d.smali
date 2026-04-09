.class final Lfe/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h;->m(Lgg/i;JLmh/l;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lmh/l;J)V
    .locals 0

    iput-object p1, p0, Lfe/h$d;->a:Lmh/l;

    iput-wide p2, p0, Lfe/h$d;->b:J

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

    if-nez p1, :cond_0

    new-instance p1, LWc/b$c;

    invoke-direct {p1}, LWc/b$c;-><init>()V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lfe/h$d;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/z;

    sget-object v0, Lfe/h$d$a;->a:Lfe/h$d$a;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    sget-object v0, Lfe/h$d$b;->a:Lfe/h$d$b;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lfe/h$d$c;

    iget-wide v1, p0, Lfe/h$d;->b:J

    invoke-direct {v0, v1, v2}, Lfe/h$d$c;-><init>(J)V

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lfe/h$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
