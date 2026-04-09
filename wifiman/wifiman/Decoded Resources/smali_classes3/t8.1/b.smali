.class public final synthetic Lt8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lt8/e;


# direct methods
.method public synthetic constructor <init>(Lt8/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/b;->a:Lt8/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt8/b;->a:Lt8/e;

    invoke-static {v0}, Lt8/e;->u0(Lt8/e;)LLi/z;

    move-result-object v0

    return-object v0
.end method
