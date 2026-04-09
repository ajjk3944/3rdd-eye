.class final LA4/y$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/y$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lcom/google/crypto/tink/shaded/protobuf/y$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA4/y$c$b;

    invoke-direct {v0}, LA4/y$c$b;-><init>()V

    sput-object v0, LA4/y$c$b;->a:Lcom/google/crypto/tink/shaded/protobuf/y$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 0

    invoke-static {p1}, LA4/y$c;->forNumber(I)LA4/y$c;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
