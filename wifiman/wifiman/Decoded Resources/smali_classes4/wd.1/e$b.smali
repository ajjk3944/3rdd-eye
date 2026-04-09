.class final Lwd/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/e;->f()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwd/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd/e$b;

    invoke-direct {v0}, Lwd/e$b;-><init>()V

    sput-object v0, Lwd/e$b;->a:Lwd/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x6

    const-string v0, "Could not get console information"

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, p1, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lwd/e$b;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
