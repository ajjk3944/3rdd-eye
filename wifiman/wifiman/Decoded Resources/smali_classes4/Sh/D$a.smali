.class public final LSh/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LSh/D$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSh/D$a;

    invoke-direct {v0}, LSh/D$a;-><init>()V

    sput-object v0, LSh/D$a;->a:LSh/D$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
