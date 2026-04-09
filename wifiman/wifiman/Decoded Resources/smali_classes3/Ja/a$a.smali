.class public final LJa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LJa/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJa/a$a;

    invoke-direct {v0}, LJa/a$a;-><init>()V

    sput-object v0, LJa/a$a;->a:LJa/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJa/a$b;)LJa/a;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJa/c;

    invoke-direct {v0, p1}, LJa/c;-><init>(LJa/a$b;)V

    return-object v0
.end method
