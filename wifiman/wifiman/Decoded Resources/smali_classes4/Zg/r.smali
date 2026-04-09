.class public final synthetic LZg/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZg/r;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZg/r;->a:[Ljava/lang/Object;

    invoke-static {v0}, LZg/s;->O([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
