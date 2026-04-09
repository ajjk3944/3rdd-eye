.class public final synthetic Lz8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lz8/c;


# direct methods
.method public synthetic constructor <init>(Lz8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/a;->a:Lz8/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz8/a;->a:Lz8/c;

    invoke-static {v0}, Lz8/c;->v0(Lz8/c;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
