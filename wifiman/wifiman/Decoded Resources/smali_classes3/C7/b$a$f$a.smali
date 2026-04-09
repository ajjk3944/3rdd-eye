.class final LC7/b$a$f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC7/b$a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC7/b$a$f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/b$a$f$a;

    invoke-direct {v0}, LC7/b$a$f$a;-><init>()V

    sput-object v0, LC7/b$a$f$a;->a:LC7/b$a$f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Lt7/d;
    .locals 1

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt7/d;

    invoke-direct {v0, p1}, Lt7/d;-><init>([B)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LC7/b$a$f$a;->a([B)Lt7/d;

    move-result-object p1

    return-object p1
.end method
