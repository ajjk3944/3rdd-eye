.class final LD8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/a$a;

    invoke-direct {v0}, LD8/a$a;-><init>()V

    sput-object v0, LD8/a$a;->a:LD8/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb8/a;)Ldf/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldf/a;

    invoke-direct {v0, p1}, Ldf/a;-><init>(Lb8/a;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb8/a;

    invoke-virtual {p0, p1}, LD8/a$a;->a(Lb8/a;)Ldf/a;

    move-result-object p1

    return-object p1
.end method
