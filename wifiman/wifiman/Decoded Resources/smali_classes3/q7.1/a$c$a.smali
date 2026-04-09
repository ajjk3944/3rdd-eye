.class public final Lq7/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/a$c;->a(LYg/J;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq7/a;


# direct methods
.method public constructor <init>(Lq7/a;)V
    .locals 0

    iput-object p1, p0, Lq7/a$c$a;->a:Lq7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq7/a$c$a;->a:Lq7/a;

    invoke-static {v0}, Lq7/a;->g(Lq7/a;)LFg/c;

    move-result-object v0

    sget-object v1, Lq7/a$a$a;->a:Lq7/a$a$a;

    invoke-virtual {v0, v1}, LFg/c;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V

    return-void
.end method
