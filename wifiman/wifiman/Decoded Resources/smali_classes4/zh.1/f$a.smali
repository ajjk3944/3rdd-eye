.class public final Lzh/f$a;
.super Lzh/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final e:Lzh/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzh/f$a;

    invoke-direct {v0}, Lzh/f$a;-><init>()V

    sput-object v0, Lzh/f$a;->e:Lzh/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Function"

    invoke-direct {p0, v0, v3, v1, v2}, Lzh/f;-><init>(LZh/c;Ljava/lang/String;ZLZh/b;)V

    return-void
.end method
