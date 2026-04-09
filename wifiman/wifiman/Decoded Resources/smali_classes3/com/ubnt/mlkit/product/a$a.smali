.class public final Lcom/ubnt/mlkit/product/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/mlkit/product/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ubnt/mlkit/product/a$a;

.field private static final b:Lcom/ubnt/mlkit/product/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/mlkit/product/a$a;

    invoke-direct {v0}, Lcom/ubnt/mlkit/product/a$a;-><init>()V

    sput-object v0, Lcom/ubnt/mlkit/product/a$a;->a:Lcom/ubnt/mlkit/product/a$a;

    new-instance v0, Lcom/ubnt/mlkit/product/b;

    invoke-direct {v0}, Lcom/ubnt/mlkit/product/b;-><init>()V

    sput-object v0, Lcom/ubnt/mlkit/product/a$a;->b:Lcom/ubnt/mlkit/product/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ubnt/mlkit/product/a;
    .locals 1

    sget-object v0, Lcom/ubnt/mlkit/product/a$a;->b:Lcom/ubnt/mlkit/product/a;

    return-object v0
.end method
