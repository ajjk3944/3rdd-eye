.class public final synthetic Lfe/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lfe/s;


# direct methods
.method public synthetic constructor <init>(Lfe/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/r;->a:Lfe/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfe/r;->a:Lfe/s;

    invoke-static {v0}, Lfe/s;->b(Lfe/s;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
