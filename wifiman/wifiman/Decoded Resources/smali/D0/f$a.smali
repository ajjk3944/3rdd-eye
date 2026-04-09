.class final LD0/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/f;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD0/f;


# direct methods
.method constructor <init>(LD0/f;)V
    .locals 0

    iput-object p1, p0, LD0/f$a;->a:LD0/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LD0/f$a;->a:LD0/f;

    invoke-virtual {v0}, LD0/f;->e()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD0/f$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
