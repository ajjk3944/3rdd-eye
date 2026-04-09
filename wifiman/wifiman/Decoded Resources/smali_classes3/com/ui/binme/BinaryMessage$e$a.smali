.class public final Lcom/ui/binme/BinaryMessage$e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/binme/BinaryMessage$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ui/binme/BinaryMessage$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/binme/BinaryMessage$e$a;

    invoke-direct {v0}, Lcom/ui/binme/BinaryMessage$e$a;-><init>()V

    sput-object v0, Lcom/ui/binme/BinaryMessage$e$a;->a:Lcom/ui/binme/BinaryMessage$e$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/binme/BinaryMessage$e;
    .locals 2

    new-instance v0, Lcom/ui/binme/a;

    new-instance v1, Lcom/ui/binme/compress/a;

    invoke-direct {v1}, Lcom/ui/binme/compress/a;-><init>()V

    invoke-direct {v0, v1}, Lcom/ui/binme/a;-><init>(Lcom/ui/binme/compress/Compressor;)V

    return-object v0
.end method
