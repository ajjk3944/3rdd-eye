.class final Lwd/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/e;->a(Lwd/f$a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwd/e$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd/e$g;

    invoke-direct {v0}, Lwd/e$g;-><init>()V

    sput-object v0, Lwd/e$g;->a:Lwd/e$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxd/a$a;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxd/a$a;

    invoke-virtual {p0, p1}, Lwd/e$g;->a(Lxd/a$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
