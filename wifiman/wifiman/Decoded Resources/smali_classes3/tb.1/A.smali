.class public final synthetic Ltb/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f$b;


# instance fields
.field public final synthetic a:Ltb/m;


# direct methods
.method public synthetic constructor <init>(Ltb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/A;->a:Ltb/m;

    return-void
.end method


# virtual methods
.method public final b(Ljava/nio/ByteBuffer;)V
    .locals 1

    iget-object v0, p0, Ltb/A;->a:Ltb/m;

    invoke-static {v0, p1}, Ltb/N;->r(Ltb/m;Ljava/nio/ByteBuffer;)V

    return-void
.end method
