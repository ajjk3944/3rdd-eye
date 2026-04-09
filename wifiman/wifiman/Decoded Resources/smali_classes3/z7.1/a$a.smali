.class public final Lz7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lz7/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/a$a;

    invoke-direct {v0}, Lz7/a$a;-><init>()V

    sput-object v0, Lz7/a$a;->a:Lz7/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz7/x;)Lz7/a;
    .locals 2

    const-string/jumbo v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz7/d;

    sget-object v1, Lo7/o;->a:Lo7/o;

    invoke-virtual {v1}, Lo7/o;->c()Lo7/b;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lz7/d;-><init>(Lo7/b;Lz7/x;)V

    return-object v0
.end method
