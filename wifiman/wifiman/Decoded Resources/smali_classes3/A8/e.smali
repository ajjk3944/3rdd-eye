.class public final synthetic LA8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LA8/f;


# direct methods
.method public synthetic constructor <init>(LA8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8/e;->a:LA8/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LA8/e;->a:LA8/f;

    invoke-static {v0}, LA8/f;->r0(LA8/f;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
