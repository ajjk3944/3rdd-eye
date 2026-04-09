.class public final Lmb/g$b;
.super LJb/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final f:Lmb/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb/g$b;

    invoke-direct {v0}, Lmb/g$b;-><init>()V

    sput-object v0, Lmb/g$b;->f:Lmb/g$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-class v0, Lmb/g;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    sget-object v1, Lmb/g$b$a;->a:Lmb/g$b$a;

    sget-object v2, Lmb/g;->UNKNOWN:Lmb/g;

    invoke-direct {p0, v0, v1, v2}, LJb/a;-><init>(Lth/d;Lmh/a;Ljava/lang/Enum;)V

    return-void
.end method
