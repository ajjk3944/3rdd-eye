.class final LM8/d$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/d$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/d$m;

    invoke-direct {v0}, LM8/d$m;-><init>()V

    sput-object v0, LM8/d$m;->a:LM8/d$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEe/g$a$a;)LEe/g;
    .locals 1

    const-string/jumbo v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LEe/g;

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, LEe/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEe/g$a$a;

    invoke-virtual {p0, p1}, LM8/d$m;->a(LEe/g$a$a;)LEe/g;

    move-result-object p1

    return-object p1
.end method
