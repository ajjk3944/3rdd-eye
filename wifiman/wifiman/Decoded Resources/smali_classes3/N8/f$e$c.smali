.class final LN8/f$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN8/f$e;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN8/f;


# direct methods
.method constructor <init>(LN8/f;)V
    .locals 0

    iput-object p1, p0, LN8/f$e$c;->a:LN8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lde/a;)Lde/a;
    .locals 0

    invoke-static {p0}, LN8/f$e$c;->c(Lde/a;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lde/a;)Lde/a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lde/a;->b(Lde/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lde/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LN8/f$e$c;->b(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LN8/f$e$c;->a:LN8/f;

    invoke-static {p1}, LN8/f;->i(LN8/f;)Lde/b;

    move-result-object p1

    new-instance v0, LN8/h;

    invoke-direct {v0}, LN8/h;-><init>()V

    invoke-interface {p1, v0}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
