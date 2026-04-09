.class LM6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM6/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a;->b(Lgg/t;LO6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/nio/ByteBuffer;

.field final synthetic b:I

.field final synthetic c:LM6/a;


# direct methods
.method constructor <init>(LM6/a;Ljava/nio/ByteBuffer;I)V
    .locals 0

    iput-object p1, p0, LM6/a$a;->c:LM6/a;

    iput-object p2, p0, LM6/a$a;->a:Ljava/nio/ByteBuffer;

    iput p3, p0, LM6/a$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()I
    .locals 2

    iget-object v0, p0, LM6/a$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, LM6/a$a;->b:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
