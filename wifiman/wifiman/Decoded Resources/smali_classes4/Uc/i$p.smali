.class final LUc/i$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc/i;->n(LUc/i$c;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUc/i$c;

.field final synthetic b:LUc/i;

.field final synthetic c:J


# direct methods
.method constructor <init>(LUc/i$c;LUc/i;J)V
    .locals 0

    iput-object p1, p0, LUc/i$p;->a:LUc/i$c;

    iput-object p2, p0, LUc/i$p;->b:LUc/i;

    iput-wide p3, p0, LUc/i$p;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LUc/i$b;)LDj/a;
    .locals 3

    iget-object v0, p0, LUc/i$p;->a:LUc/i$c;

    invoke-virtual {v0}, LUc/i$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LUc/i$b;->a(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$a;

    iget-object v1, p0, LUc/i$p;->b:LUc/i;

    iget-object v2, p0, LUc/i$p;->a:LUc/i$c;

    invoke-direct {v0, v1, v2}, LUc/i$p$a;-><init>(LUc/i;LUc/i$c;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$b;

    iget-object v1, p0, LUc/i$p;->a:LUc/i$c;

    invoke-direct {v0, v1}, LUc/i$p$b;-><init>(LUc/i$c;)V

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$c;

    iget-object v1, p0, LUc/i$p;->a:LUc/i$c;

    invoke-direct {v0, v1}, LUc/i$p$c;-><init>(LUc/i$c;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$d;

    iget-object v1, p0, LUc/i$p;->a:LUc/i$c;

    invoke-direct {v0, v1}, LUc/i$p$d;-><init>(LUc/i$c;)V

    invoke-virtual {p1, v0}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$e;

    iget-wide v1, p0, LUc/i$p;->c:J

    invoke-direct {v0, v1, v2}, LUc/i$p$e;-><init>(J)V

    invoke-virtual {p1, v0}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LUc/i$p$f;

    iget-wide v1, p0, LUc/i$p;->c:J

    invoke-direct {v0, v1, v2}, LUc/i$p$f;-><init>(J)V

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUc/i$b;

    invoke-virtual {p0, p1}, LUc/i$p;->a(LUc/i$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
