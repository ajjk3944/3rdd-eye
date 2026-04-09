.class public final LDh/I$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDh/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LDh/I$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDh/I$b;

    invoke-direct {v0}, LDh/I$b;-><init>()V

    sput-object v0, LDh/I$b;->b:LDh/I$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LDh/F;LZh/c;Loi/n;)LBh/U;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDh/x;

    invoke-direct {v0, p1, p2, p3}, LDh/x;-><init>(LDh/F;LZh/c;Loi/n;)V

    return-object v0
.end method
