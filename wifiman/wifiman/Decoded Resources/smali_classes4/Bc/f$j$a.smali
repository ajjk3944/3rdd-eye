.class final LBc/f$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f$j;->a(LBc/f$d;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/i;

.field final synthetic b:Lgg/i;

.field final synthetic c:LBc/f;


# direct methods
.method constructor <init>(Lgg/i;Lgg/i;LBc/f;)V
    .locals 0

    iput-object p1, p0, LBc/f$j$a;->a:Lgg/i;

    iput-object p2, p0, LBc/f$j$a;->b:Lgg/i;

    iput-object p3, p0, LBc/f$j$a;->c:LBc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/f$c;)LDj/a;
    .locals 2

    const-string v0, "requirements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBc/f$c$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, LBc/f$j$a;->a:Lgg/i;

    iget-object v0, p0, LBc/f$j$a;->b:Lgg/i;

    sget-object v1, LBc/f$j$a$a;->a:LBc/f$j$a$a;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LBc/f$c$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, LBc/f$j$a;->c:LBc/f;

    check-cast p1, LBc/f$c$b;

    invoke-static {v0, p1}, LBc/f;->j(LBc/f;LBc/f$c$b;)LBc/a$b$b;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/f$c;

    invoke-virtual {p0, p1}, LBc/f$j$a;->a(LBc/f$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
