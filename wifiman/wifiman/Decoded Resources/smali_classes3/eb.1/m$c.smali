.class final Leb/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/m;->f()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/m$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/m$c;

    invoke-direct {v0}, Leb/m$c;-><init>()V

    sput-object v0, Leb/m$c;->a:Leb/m$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;Leb/m$b;)Ljava/nio/ByteBuffer;
    .locals 1

    sget-object v0, Leb/m$b;->OPEN:Leb/m$b;

    if-ne p2, v0, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "Web socket is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    check-cast p2, Leb/m$b;

    invoke-virtual {p0, p1, p2}, Leb/m$c;->a(Ljava/nio/ByteBuffer;Leb/m$b;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
