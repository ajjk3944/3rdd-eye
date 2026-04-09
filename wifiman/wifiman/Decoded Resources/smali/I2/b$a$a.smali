.class LI2/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI2/b$a;->d(LI2/r;)LI2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LI2/b$a;


# direct methods
.method constructor <init>(LI2/b$a;)V
    .locals 0

    iput-object p1, p0, LI2/b$a$a;->a:LI2/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public bridge synthetic b([B)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LI2/b$a$a;->c([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public c([B)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
