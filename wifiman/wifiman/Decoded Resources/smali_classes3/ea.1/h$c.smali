.class final Lea/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/h;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lea/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/h$c;

    invoke-direct {v0}, Lea/h$c;-><init>()V

    sput-object v0, Lea/h$c;->a:Lea/h$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LEb/r;->i()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, Lea/h$c;->a(LEb/r;)Z

    move-result p1

    return p1
.end method
