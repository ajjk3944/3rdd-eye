.class public final LIa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LIa/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIa/a$a;

    invoke-direct {v0}, LIa/a$a;-><init>()V

    sput-object v0, LIa/a$a;->a:LIa/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;LLa/c;LIa/a$b;)LIa/a;
    .locals 1

    const-string/jumbo v0, "clientApp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LIa/b;

    invoke-direct {v0, p1, p2, p3}, LIa/b;-><init>(Ljava/lang/String;LLa/c;LIa/a$b;)V

    return-object v0
.end method
