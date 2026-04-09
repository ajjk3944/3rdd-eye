.class public final LJh/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJh/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LJh/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/v$a;

    invoke-direct {v0}, LJh/v$a;-><init>()V

    sput-object v0, LJh/v$a;->a:LJh/v$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LLh/c;)V
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
