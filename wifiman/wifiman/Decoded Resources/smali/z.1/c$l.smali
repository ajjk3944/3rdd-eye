.class public final Lz/c$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/c$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LY0/d;I[I[I)V
    .locals 0

    sget-object p1, Lz/c;->a:Lz/c;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p4, p2}, Lz/c;->i([I[IZ)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Arrangement#Top"

    return-object v0
.end method
