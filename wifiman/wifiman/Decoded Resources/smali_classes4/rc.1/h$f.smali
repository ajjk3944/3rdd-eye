.class final Lrc/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrc/h;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrc/h$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrc/h$f;

    invoke-direct {v0}, Lrc/h$f;-><init>()V

    sput-object v0, Lrc/h$f;->a:Lrc/h$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LMb/c;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMb/c;->d()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LMb/c;

    invoke-virtual {p0, p1}, Lrc/h$f;->a(LMb/c;)Z

    move-result p1

    return p1
.end method
