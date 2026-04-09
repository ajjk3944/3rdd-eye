.class public final synthetic Ld0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/b;


# instance fields
.field public final synthetic a:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/c;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-object v0, p0, Ld0/c;->a:Lmh/p;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/g$a;->b(Lmh/p;)V

    return-void
.end method
