.class final Ly8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/f;->g(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/f;


# direct methods
.method constructor <init>(Ly8/f;)V
    .locals 0

    iput-object p1, p0, Ly8/f$a;->a:Ly8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 8

    const-string/jumbo v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Ly8/f$a$b;

    invoke-direct {v1, v0}, Ly8/f$a$b;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "ignoreElements(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Ly8/f$a;->a:Ly8/f;

    invoke-static {v1}, Ly8/f;->c(Ly8/f;)Lgg/y;

    move-result-object v7

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x32

    invoke-static/range {v2 .. v7}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, Ly8/f$a$a;

    invoke-direct {v1, v0}, Ly8/f$a$a;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
