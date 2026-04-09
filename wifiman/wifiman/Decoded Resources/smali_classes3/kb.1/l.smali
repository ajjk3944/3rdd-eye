.class public final Lkb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/l$a;,
        Lkb/l$b;,
        Lkb/l$c;
    }
.end annotation


# static fields
.field public static final g:Lkb/l$a;


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private b:Z

.field private c:Lkb/l$c;

.field private d:Lkb/l$b;

.field private e:Z

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkb/l;->g:Lkb/l$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    sget-object v0, Lkb/l$c;->INVALID:Lkb/l$c;

    iput-object v0, p0, Lkb/l;->c:Lkb/l$c;

    sget-object v0, Lkb/l$b;->INVALID:Lkb/l$b;

    iput-object v0, p0, Lkb/l;->d:Lkb/l$b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_0
    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    sget-object p1, Lkb/l$c;->Companion:Lkb/l$c$a;

    iget-object v0, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p1, v0}, Lkb/l$c$a;->a(B)Lkb/l$c;

    move-result-object p1

    iput-object p1, p0, Lkb/l;->c:Lkb/l$c;

    sget-object p1, Lkb/l$b;->Companion:Lkb/l$b$a;

    iget-object v0, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p1, v0}, Lkb/l$b$a;->a(B)Lkb/l$b;

    move-result-object p1

    iput-object p1, p0, Lkb/l;->d:Lkb/l$b;

    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lkb/l;->e:Z

    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object p1, p0, Lkb/l;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    iput p1, p0, Lkb/l;->f:I

    iput-boolean v0, p0, Lkb/l;->b:Z

    :cond_2
    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lkb/l;->f:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lkb/l;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lkb/l;->e:Z

    return v0
.end method
