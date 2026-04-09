.class final Lhb/c$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c$g;->a(Lpb/l;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;

.field final synthetic b:Lpb/l;


# direct methods
.method constructor <init>(Lhb/c;Lpb/l;)V
    .locals 0

    iput-object p1, p0, Lhb/c$g$a;->a:Lhb/c;

    iput-object p2, p0, Lhb/c$g$a;->b:Lpb/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lhb/c;Leb/i$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lhb/c$g$a;->c(Lhb/c;Leb/i$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lhb/c;Leb/i$a;)LYg/J;
    .locals 1

    const-string/jumbo v0, "connectionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lhb/c;->B(Lhb/c;Leb/i$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/b;

    invoke-virtual {p0, p1}, Lhb/c$g$a;->b(Llb/b;)Lgg/v;

    move-result-object p1

    return-object p1
.end method

.method public final b(Llb/b;)Lgg/v;
    .locals 11

    const-string/jumbo v0, "cloudCredentials"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ltb/V;->a:Ltb/V;

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->r(Lhb/c;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->u(Lhb/c;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->x(Lhb/c;)LGb/f;

    move-result-object v4

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->v(Lhb/c;)Z

    move-result v8

    iget-object v6, p0, Lhb/c$g$a;->b:Lpb/l;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->w(Lhb/c;)Llb/c;

    move-result-object v7

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->y(Lhb/c;)Ltb/V$a;

    move-result-object v9

    iget-object v0, p0, Lhb/c$g$a;->a:Lhb/c;

    new-instance v10, Lhb/d;

    invoke-direct {v10, v0}, Lhb/d;-><init>(Lhb/c;)V

    move-object v5, p1

    invoke-virtual/range {v1 .. v10}, Ltb/V;->m(Ljava/lang/String;Ljava/lang/String;LGb/f;Llb/b;Lpb/l;Llb/c;ZLtb/V$a;Lmh/l;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
