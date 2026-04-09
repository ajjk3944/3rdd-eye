.class public final synthetic Lod/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lod/i;


# direct methods
.method public synthetic constructor <init>(Lod/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/h;->a:Lod/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lod/h;->a:Lod/i;

    invoke-static {v0}, Lod/i;->g(Lod/i;)Lod/i$a;

    move-result-object v0

    return-object v0
.end method
