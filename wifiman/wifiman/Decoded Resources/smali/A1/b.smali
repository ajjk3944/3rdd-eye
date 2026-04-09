.class final LA1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA1/b;

    invoke-direct {v0}, LA1/b;-><init>()V

    sput-object v0, LA1/b;->a:LA1/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putSize(Ljava/lang/String;Landroid/util/Size;)V

    return-void
.end method

.method public static final b(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putSizeF(Ljava/lang/String;Landroid/util/SizeF;)V

    return-void
.end method
