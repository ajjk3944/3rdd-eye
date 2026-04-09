.class final Ln8/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/g$a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/g$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/g$a$a;

    invoke-direct {v0}, Ln8/g$a$a;-><init>()V

    sput-object v0, Ln8/g$a$a;->a:Ln8/g$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/a$b;

    new-instance v0, Ll9/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljd/a$b;->b()LCc/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ln8/g$a$a;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
