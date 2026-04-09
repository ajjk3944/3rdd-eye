.class public final synthetic LF3/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/b;


# instance fields
.field public final synthetic a:La3/i;


# direct methods
.method public synthetic constructor <init>(La3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF3/X;->a:La3/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    const-string v0, "proto"

    invoke-static {v0}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object v0

    new-instance v1, LF3/V;

    invoke-direct {v1}, LF3/V;-><init>()V

    iget-object v2, p0, LF3/X;->a:La3/i;

    const-string v3, "FIREBASE_ML_SDK"

    const-class v4, [B

    invoke-interface {v2, v3, v4, v0, v1}, La3/i;->a(Ljava/lang/String;Ljava/lang/Class;La3/b;La3/g;)La3/h;

    move-result-object v0

    return-object v0
.end method
