.class public final synthetic Ltb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ltb/f;


# direct methods
.method public synthetic constructor <init>(Ltb/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/d;->a:Ltb/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltb/d;->a:Ltb/f;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {v0, p1}, Ltb/f;->d(Ltb/f;Ljava/nio/ByteBuffer;)LYg/J;

    move-result-object p1

    return-object p1
.end method
