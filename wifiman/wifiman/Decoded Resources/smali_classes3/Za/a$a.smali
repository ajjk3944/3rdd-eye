.class public final LZa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LZa/a$a;

.field private static final b:LZa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZa/a$a;

    invoke-direct {v0}, LZa/a$a;-><init>()V

    sput-object v0, LZa/a$a;->a:LZa/a$a;

    new-instance v0, LZa/b;

    invoke-direct {v0}, LZa/b;-><init>()V

    sput-object v0, LZa/a$a;->b:LZa/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LZa/a;
    .locals 1

    sget-object v0, LZa/a$a;->b:LZa/a;

    return-object v0
.end method
